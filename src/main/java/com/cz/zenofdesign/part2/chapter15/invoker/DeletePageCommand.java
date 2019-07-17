package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: DeletePageCommand
 * @date: 2019/7/11  15:12
 * @author: guohao
 * @Description: 删除页面命令
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        this.pageGroup.find();
        this.pageGroup.delete();
        this.pageGroup.plan();
    }
}
