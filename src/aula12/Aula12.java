package aula12;
/**
*@author AriCamargos
*@version 8.0 (July 25, 2021)
* Estudo da técnica de herança entre animais e classe abstrata
**/
public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguro c = new Canguro();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        
    }
    
}
