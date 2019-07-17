package com.cz.zenofdesign.part2.chapter17.decorator;

/**
 * @ClassName: HighScoreDecorator
 * @date: 2019/7/11  16:50
 * @author: guohao
 * @Description: 高分修饰
 */
public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高是75,数学78，自然80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
