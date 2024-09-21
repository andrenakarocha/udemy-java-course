package Sections.Section13.Encapsulation.Package2;

public class ClassC extends ClassB {

    // Não posso mudar a visibilidade da função em uma classe filha usando o Override
//    @Override
//    protected void doSomething() {
//
//    }

    //Porém, quando a função tem visibilidade padrão, ou seja, tem apenas o void, aí, sim, eu consigo mudar a visibilidade com o Override
    @Override
    public void doSomethingClassB() {

    }
}
