package com.atguigu.mybatis.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * @author Administrator
 *  基于数据表逆向生成 pojo类 和 XzzMapper.java 以及XzzMapper.xml 映射文件
 */
public class MybatisGen {
	
  protected static Logger logger = Logger.getLogger(MybatisGen.class);
  
  public static void main(String[] args) throws Exception {
     List<String> warnings = new ArrayList<String>();
       boolean overwrite = true;
       File configFile = new File("src/main/resources/generatorConfig.xml");
       ConfigurationParser cp = new ConfigurationParser(warnings);
       Configuration config = cp.parseConfiguration(configFile);
       DefaultShellCallback callback = new DefaultShellCallback(overwrite);
       MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
       myBatisGenerator.generate(null);
       
       logger.info("mybatis generator completed ....");
  }
  
}
