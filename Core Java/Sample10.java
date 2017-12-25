class BoxDemo1
{
 double width,height,depth;
 BoxDemo1()
 {
  width=2;
  height=3;
  depth=5;
 }
 BoxDemo1(double w)
 {
  width=w;
  height=2;
  depth=6;
 }
 BoxDemo1(double w,double h)
 {
  width=w;
  height=h;
  depth=8;
 }
 BoxDemo1(double w,double h,double d)
 {
  width=w;
  height=h;
  depth=d;
 }
 BoxDemo1(BoxDemo1 b)
 {
  width=b.width;
  height=b.height;
  depth=b.depth;
  System.out.println("copy constructor is invoking......");
 }
 void show()
 {
  System.out.println("width: "+width+"\t height: "+height+"\t depth: "+depth);
 }
 double volume()
 {
  return width*height*depth;
 }
}
class Sample10
{
 public static void main(String args[])
 {
  BoxDemo1 b1=new BoxDemo1();
  BoxDemo1 b2=new BoxDemo1(8);
  BoxDemo1 b3=new BoxDemo1(11,4);
  BoxDemo1 b4=new BoxDemo1(7,5,9);
  BoxDemo1 b5=new BoxDemo1(b2);
  double v;
  v=b1.volume();
  b1.show();
  System.out.println("volume: "+v);
  v=b2.volume();
  b2.show();
  System.out.println("volume: "+v);
  v=b3.volume();
  b3.show();
  System.out.println("volume: "+v);
  v=b4.volume();
  b4.show();
  System.out.println("volume: "+v);
  v=b5.volume();
  b5.show();
  System.out.println("volume: "+v);
 }
}