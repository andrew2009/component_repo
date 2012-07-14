/*  
 *
 * 文件名： AbstractLoggerConfigurator.java
 * 版权：Copyright 2001 ~ 2012 Jlab.net All Rights Reserved.
 * 文件描述： 日志配置器
 * 修订责任人： Andrew 
 * 修订时间： May 12, 2012 3:05:19 PM
 * 修订内容：新增  
 *
 */
package net.jlab.explab.log.util.l4j;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;

/**
 * 类名： AbstractLoggerConfigurator <br/>
 * 描述： 日志配置器，使得子类具备日志能力 <br/>
 * 作者： Andrew <br/>
 * 修订时间： May 12, 2012 3:05:19 PM <br/>
 * 版本：V1.0 <br/>
 * 
 */
public abstract class AbstractLoggerConfigurator {

    private static final String LOG4J_CFG_FILE_PATH = "/net/jlab/explab/log/util/l4j/log4j_exp.properties";

    static {
	URL url = AbstractLoggerConfigurator.class
		.getResource(LOG4J_CFG_FILE_PATH);
	PropertyConfigurator.configure(url);
    }

}
