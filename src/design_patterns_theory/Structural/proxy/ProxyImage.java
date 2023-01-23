package design_patterns_theory.Structural.proxy;

// ** In proxy pattern, a class represents functionality of another class.
//
// ** In proxy pattern, we create object having original
// object to interface its functionality to outer world.
//
// ** We can perform many operations like hiding the
// information of original object, on demand loading etc.
//
//Proxy pattern is also known as Surrogate or Placeholder.
//
// ** Benefits
// 1. One of the advantages of Proxy pattern is security.
// 2. This pattern avoids duplication of objects which might
// be huge size and memory intensive. This in turn increases
// the performance of the application.
// 3. The remote proxy also ensures about security by
// installing the local code proxy (stub) in the client machine
// and then accessing the server with help of the remote code.
public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}