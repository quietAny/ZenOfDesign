package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: Command
 * @date: 2019/7/11  15:07
 * @author: guohao
 * @Description: 命令抽象类
 */
public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();

}
