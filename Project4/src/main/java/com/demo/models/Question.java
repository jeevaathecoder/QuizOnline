package com.demo.models;
// Generated Nov 23, 2022, 2:56:37 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "project4")
public class Question implements java.io.Serializable {

	private Integer questionId;
	private Grade grade;
	private Lever lever;
	private Subject subject;
	private String name;
	private String content;
	private Date created;
	private String type;
	private String photo;
	private boolean status;
	private Set<Answer> answers = new HashSet<Answer>(0);
	private Set<Exam> exams = new HashSet<Exam>(0);

	public Question() {
	}

	public Question(Grade grade, Lever lever, Subject subject, String name, String content, Date created, String type,
			String photo, boolean status) {
		this.grade = grade;
		this.lever = lever;
		this.subject = subject;
		this.name = name;
		this.content = content;
		this.created = created;
		this.type = type;
		this.photo = photo;
		this.status = status;
	}

	public Question(Grade grade, Lever lever, Subject subject, String name, String content, Date created, String type,
			String photo, boolean status, Set<Answer> answers, Set<Exam> exams) {
		this.grade = grade;
		this.lever = lever;
		this.subject = subject;
		this.name = name;
		this.content = content;
		this.created = created;
		this.type = type;
		this.photo = photo;
		this.status = status;
		this.answers = answers;
		this.exams = exams;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_id", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grade_id", nullable = false)
	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lever_id", nullable = false)
	public Lever getLever() {
		return this.lever;
	}

	public void setLever(Lever lever) {
		this.lever = lever;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", nullable = false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "content", nullable = false, length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "photo", length = 250)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Answer> getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "questions")
	public Set<Exam> getExams() {
		return this.exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}


}
