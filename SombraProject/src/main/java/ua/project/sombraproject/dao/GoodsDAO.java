package ua.project.sombraproject.dao;

import java.util.List;

import ua.project.sombraproject.model.Goods;

public interface GoodsDAO {

	public void newGoods(Goods goods);

	public void updateGoods(Goods goods);

	public void deleteGoods(int goodsID);

	public List<Goods> filterByCategory(int goodsCategoryID);

	public Goods getGoodsByID(int goodsID);

	public List<Goods> allGoodsList();
}