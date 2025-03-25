package jyoti_practice;

public class super_this_key {
    String name;
    String model;
    super_this_key(){

    }
    super_this_key(String name,String model){
        this.name = name;
        this.model = model;
    }
    void display(){
        System.out.println(this.model +" "+ this.name);
    }


}
class ExentedClass extends super_this_key{
    String modelName;
    int modelnumber;;
    void carmodel(){
        System.out.println("model name: "+ modelName + "modelnumber: " + modelnumber);
    }


}

class Vehicale extends  ExentedClass{


    public static void main(String[] args) {
        super_this_key object = new super_this_key("model","name");
        //object.display();

        //super.display();



        }
    }





