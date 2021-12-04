package com.szpiler._10_decorator;

import com.szpiler._10_decorator.decorator.GreenShapeDecorator;
import com.szpiler._10_decorator.decorator.ItemRepository;
import com.szpiler._10_decorator.decorator.ItemRepositoryCached;
import com.szpiler._10_decorator.decorator.RedShapeDecorator;
import com.szpiler._10_decorator.model.Circle;
import com.szpiler._10_decorator.model.Item;
import com.szpiler._10_decorator.model.Rectangle;
import com.szpiler._10_decorator.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Item> items = new ArrayList<>();

    items.add(new Item(1, "AAA"));
    items.add(new Item(2, "BBB"));

    ItemRepository itemRepository = new ItemRepository();
    ItemRepository itemRepositoryCached = new ItemRepositoryCached(itemRepository);

    itemRepository.load(items);

    Item result1 = itemRepository.getById(1);
    Item result2 = itemRepositoryCached.getById(1);
    Item result3 = itemRepositoryCached.getById(1);
    Item result4 = itemRepositoryCached.getById(1);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);

    System.out.println("-------------------------");

    Shape rectangle = new Rectangle();
    Shape circle = new Circle();

    Shape rectangleWithGreenBorder = new GreenShapeDecorator(rectangle);
    Shape circleWithRedBorder = new RedShapeDecorator(circle);

    rectangle.draw();
    System.out.println("--------------");

    circle.draw();
    System.out.println("--------------");

    rectangleWithGreenBorder.draw();
    System.out.println("--------------");

    circleWithRedBorder.draw();
    System.out.println("--------------");
  }
}
