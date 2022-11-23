package Developers;

import langugeProgramming.LangugeProgramming;

public abstract class Developer {
   private LangugeProgramming langugeProgramming;
    private int age;
    public Developer(LangugeProgramming langugeProgramming, int age){
        this.langugeProgramming = langugeProgramming;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public LangugeProgramming getLangugeProgramming() {
        return langugeProgramming;
    }
}
