package com.sample.di.demo5;

public class PointDummyDao implements PointDao{
	public void updatePoint(String id, int point) {
		System.out.println(id+"님 잔여포인트 "+point+"포인트");
	}
}
