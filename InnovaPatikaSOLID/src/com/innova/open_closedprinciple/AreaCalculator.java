package com.innova.open_closedprinciple;
//dikdörtgenin alanını hesaplayan  birde sınıfımız
//çemberin alanını hesaplıcaz diyelim birde onuniçin  alan hesaplayalım
public class AreaCalculator{

    public Double calculateRectangleArea(Rectangle rectangle){

        return rectangle.length * rectangle.width;
    }
//daha sonradan ekledik
    public Double calculateCircleArea(Circle circle){

        return (22 / 7) * circle.radius * circle.radius;
    }
    //diyelimki üçgen alan hesaplıcaz sürekli bu sınıfı değiştirmek zorunda kalırız
    //bunun için yeni bir interface oluşturalım

    public Double calculateShapeArea(Shape shape) {

        return shape.calculateArea();
    }
    //Artık interfacemizi bu şekilde kullanabiliriz
}
