package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: AddRequirementCommand
 * @date: 2019/7/11  15:11
 * @author: guohao
 * @Description: 添加需求命令
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
