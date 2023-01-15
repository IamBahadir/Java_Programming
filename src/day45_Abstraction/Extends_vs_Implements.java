package day45_Abstraction;

interface  X{

}

interface Y {

}

interface Z extends X,Y{

}

class A{

}
class B{

}

/*
class C extends B,A{

}
*/

class C extends A implements X,Y,Z {

}





public class Extends_vs_Implements {
}
