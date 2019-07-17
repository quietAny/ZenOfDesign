package com.cz.zenofdesign.part4.chapter36.observerandmediator;

/**
 * @ClassName: Product
 * @date: 2019/7/16  17:02
 * @author: guohao
 * @Description: 产品类
 */
public class Product implements Cloneable {

    private String name;
    private boolean canChanged = false;

    public Product(ProductManager manager,String name) {
        if(manager.isCreateProduct()){
            canChanged = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        Product p = null;
        p = (Product)super.clone();
        return p;
    }
}
