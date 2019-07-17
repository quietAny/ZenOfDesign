package com.cz.zenofdesign.part4.chapter34.invokerandchainofresponsibility;

/**
 * @ClassName: LS
 * @date: 2019/7/16  15:02
 * @author: guohao
 * @Description:
 */
public class LS extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return super.DEEAULT_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.getCommandName());
    }
}
