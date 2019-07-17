package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: CompositeSpecification
 * @date: 2019/7/17  10:54
 * @author: guohao
 * @Description:
 */
public abstract class CompositeSpecification implements IUserSpecification{


    public abstract boolean isSatisfiedBy(User user);

    @Override
    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this,spec);
    }

    @Override
    public IUserSpecification or(IUserSpecification spec) {
        return new OrSpecification(this,spec);
    }

    @Override
    public IUserSpecification not() {
        return new NotSpecification(this);

    }
}
