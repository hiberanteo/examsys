package com.sanqing.service;

import java.util.List;

import com.sanqing.dao.ScoreDAO;
import com.sanqing.dao.ScoreDAOImpl;
import com.sanqing.po.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDAO scoreDAO = new ScoreDAOImpl();
	public boolean addScore(Score score) {
		if(scoreDAO.findScoreById(score.getId())==null){
			scoreDAO.addScore(score);
			return true;
		}else{
			return false;
		}

	}

	public void deleteScore(int id) {
		scoreDAO.deleteScore(id);

	}

	public List<Score> findAllScore() {
		return scoreDAO.findAllScore();
	}

	public List<Score> findBetween(float min, float max, int typeId) {
		return scoreDAO.findBetween(min, max, typeId);
	}

	public List<Score> findByStuId(int stuId) {
		return scoreDAO.findByStuId(stuId);
	}

	public List<Score> findByTypeId(int typeId) {
		return scoreDAO.findByTypeId(typeId);
	}

	public Score findScoreById(int id) {
		return scoreDAO.findScoreById(id);
	}

	public void updateScore(Score score) {
		scoreDAO.updateScore(score);
	}

}
