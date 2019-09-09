package com.zhaoyuxi.common.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.zhaoyuxi.common.utils.DateUtil;



/**
 * @author 作者:赵玉玺
 * @version 创建时间：2019年9月8日 下午8:29:25 类功能说明
 */
public class TestDateUtil {

	@Test
	public void testLastDate() throws ParseException {

		Date end = DateUtil.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(" end is " + end);
		System.out.println(" end is " + format.format(end));

	}
}
