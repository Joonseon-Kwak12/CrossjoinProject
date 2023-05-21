package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.Article;

@Mapper
public interface ArticleRepositoryDBInterface extends ArticleRepository{
	
	@Override
	int write(Article aritcle);

	@Override
	List<Article> getFreeboardsArticleList(Integer page);

	@Override
	void modifyArticle(Integer id, Article article);

	//-----------------------------------------------------------------------------------------------
	public void writeArticle(int memberId, int boardId, String title, String body);
	
	public List<Article> getArticles();

	public Article getArticle(int id);
	
	public List<Article> getForPrintAllArticles(int articleFrom, int articlesPerPage, String searchKeywordTypeCode, String searchKeyword);
	
	public List<Article> getForPrintArticles(Integer boardId, int articleFrom, int articlesPerPage, String searchKeywordTypeCode, String searchKeyword);
	
	public int getAllArticlesCount(String searchKeywordTypeCode,String searchKeyword);
	
	public int getArticlesCount(int boardId, String searchKeywordTypeCode, String searchKeyword);
	
	public Article getForPrintArticle(int id);
	
	public void deleteArticle(int id);

	public void modifyArticle(int id, String title, String body);
	
	public int getLastInsertId();

//	어떻게 반환값 int로 받아올 수 있는지 알아볼 것 -> UPDATE, DELETE, INSERT는 원래 affectedRow 개수를 반환함
	public int increaseHitCount(int id);
	
	public int getArticleHitCount(int id);

	public void increaseLike(int id);

//	public int getSumReactionPointByMemberId(int actorId, int id);
	
	public int increaseGoodReactionPoint(int relId);

	public int increaseBadReactionPoint(int relId);

//	public int cancelReactionPoint(int relId);

	public int cancelGoodReactionPoint(int relId);

	public int cancelBadReactionPoint(int relId);
	
}
