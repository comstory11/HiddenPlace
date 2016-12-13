package com.phoenix.hiddenplace.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.phoenix.hiddenplace.dao.BookmarkDao;
import com.phoenix.hiddenplace.domain.MyHiddenPlace;

@Service
public class BookmarkServiceImpl implements BookmarkService {

	@Inject
	private BookmarkDao dao;

	

	@Override
	public void bookmarkDelete(String nums) throws Exception {
		dao.bookmarkDelete(nums);
	}
	
	//즐겨찾기 등록(홈페이지)
	@Override
	public void bookmarkInsertMHP(MyHiddenPlace myHiddenPlace) throws Exception {
		dao.bookmarkInsertMHP(myHiddenPlace);
	}
	
	//즐겨찾기 해제(홈페이지)
	@Override
	public void bookmarkDeleteMHP(MyHiddenPlace myHiddenPlace) throws Exception {
		dao.bookmarkDeleteMHP(myHiddenPlace);
	}
	
}