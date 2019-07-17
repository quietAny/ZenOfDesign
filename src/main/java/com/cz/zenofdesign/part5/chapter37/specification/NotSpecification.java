package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: NotSpecification
 * @date: 2019/7/17  10:58
 * @author: guohao
 * @Description:
 */
public class NotSpecification extends CompositeSpecification {

    private IUserSpecification spec;

    public NotSpecification(IUserSpecification spec) {
        this.spec = spec;
    }

    /**
     * not操作
     * @param user
     * @return
     */
    @Override
    public boolean isSatisfiedBy(User user) {
        return !spec.isSatisfiedBy(user);
    }


}
