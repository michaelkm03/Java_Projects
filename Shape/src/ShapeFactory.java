/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class ShapeFactory {
    public ShapeFactory(){}
    
    public Shape createShape(String shape){
        
        Shape obj = null;
        switch(shape.toLowerCase()){
            case "circle":
                    obj = new Circle();
                    break;
            case "square":
                    obj = new Square();
                    break;
        }
    }
}
