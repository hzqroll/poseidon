package com.roll.poseidon.api.pojo;

import java.io.Serializable;

/**
 * Created by haozq
 * Date: 2018/6/4 下午5:52
 */
public class User implements Serializable {

	private static final long serialVersionUID = -8845616545486464329L;
	private Long id;
	private String name;
	private Long score;

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", score='" + score + '\'' +
				'}';
	}
}
