package com.sanqing.dao;

import java.util.List;

import com.sanqing.po.Score;

public interface ScoreDAO {
	public void addScore(Score score);
	public void deleteScore(int id);
	public void updateScore(Score score);
	public Score findScoreById(int id);
	public List<Score> findAllScore();
	public List<Score> findByTypeId(int typeId);
	public List<Score> findByStuId(int stuId);
	public List<Score> findBetween(float min,float max,int typeId);
}
