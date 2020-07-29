package com.sarafu.pages;

import java.util.List;

import com.sarafu.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashBoard extends TestBase {

	public DashBoard() {
		super();
	}
	
	@AndroidFindBy(xpath="/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	private AndroidElement services;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
	private AndroidElement topCategories;
	

}
