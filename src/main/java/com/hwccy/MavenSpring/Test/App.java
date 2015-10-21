package com.hwccy.MavenSpring.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwccy.MavenSpring.entity.Boss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        Boss boss=(Boss) ctx.getBean("boss");
        System.out.println(boss);
    }
}
