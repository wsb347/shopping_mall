package com.example.sbs.demo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbs.demo1.dto.Article;

@Controller
public class UsrArticleController {

	public List<Article> articles;
	
	public UsrArticleController() {
		articles = new ArrayList<>();

		articles.add(new Article(1, "제목1", "내용1", 1000, "2022-03-28 12:12:12"));
		articles.add(new Article(2, "제목2", "내용2", 2000, "2022-03-28 12:12:12"));
	}

	// 게시글 수정
		@RequestMapping("/usr/article/doModify")
		@ResponseBody
		public List<Article> doModifyArticle(int id, String name, String body, int price, String date) {

			articles.get(id).setId(id);
			articles.get(id).setName(name);
			articles.get(id).setBody(body);
			articles.get(id).setDate(date);
			articles.get(id).setPrice(price);
			
			return articles;
		}
	
	// 게시글 삭제
	@RequestMapping("/usr/article/delete")
	@ResponseBody
	public List<Article> deleteArticle(int id) {

		articles.remove(id - 1);

		return articles;
	}

	// 게시글 추가
	@RequestMapping("/usr/article/add")
	@ResponseBody
	public Article addArticle(int id, String name, String body, int price, String date) {
		articles.add(new Article(id, name, body, price, date));

		return articles.get(id - 1);
	}

	// 게시글 상세보기
	@RequestMapping("/usr/article/detail")
	@ResponseBody
	public Article showDetail(int id) {
		return articles.get(id - 1);
	}

	// 게시글 리스트
	@RequestMapping("/usr/article/list")
	@ResponseBody
	public List<Article> articleList() {
		
		return articles;
	}
	
}
