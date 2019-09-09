package com.zhaoyuxi.common.test;

import java.util.Properties;

import org.junit.Test;

import com.zhaoyuxi.common.utils.FileUtil;


/**
 * @author 作者:赵玉玺
 * @version 创建时间：2019年9月8日 下午8:29:57 类功能说明
 */
public class TestFile {
	@Test
	public void testDel() {
		FileUtil.delFilePath("D:\\ec4 - 副本");
	}

	@Test
	public void TestPro() {

		Properties properties = System.getProperties();

		properties.forEach((key, value) -> {
			System.out.println("key is : " + key);
			System.out.println("value is : " + value);
		});
	}

}
