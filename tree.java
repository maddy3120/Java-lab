interface testshape{
        double pi=3.14;
        void area();
        void perimeter();
}
class shape{
        private int r;
        public void setradius(int r){
                this.r=r;
        }
        public int getradius(){
                return r;
        }
}
class test extends shape implements testshape{
        public void area(){
                int r=getradius();
                System.out.println("Area of the circle:"+(pi*r*r));
                }
        public void perimeter(){
                int r=getradius();
                System.out.println("Perimeter of the circle:"+(2*pi*r));
        }
}
class tree{
        public static void main(String args[]){
                test t=new test();
                t.setradius(10);
                t.area();
                t.perimeter();
        }
} 
