package com.web.demo.entity;
// Generated Jun 29, 2021, 8:56:47 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ViewBlog generated by hbm2java
 */
@Entity
@Table(name = "view_blog", catalog = "megalodondb")
public class ViewBlog implements java.io.Serializable {

	private Integer idViewBlog;
	private Date date;
	private Integer countView;
	private Set<Blog> blogs = new HashSet<Blog>(0);

	public ViewBlog() {
	}

	public ViewBlog(Date date, Integer countView, Set<Blog> blogs) {
		this.date = date;
		this.countView = countView;
		this.blogs = blogs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_view_blog", unique = true, nullable = false)
	public Integer getIdViewBlog() {
		return this.idViewBlog;
	}

	public void setIdViewBlog(Integer idViewBlog) {
		this.idViewBlog = idViewBlog;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date")
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "count_view")
	public Integer getCountView() {
		return this.countView;
	}

	public void setCountView(Integer countView) {
		this.countView = countView;
	}

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "viewBlog")
//	public Set<Blog> getBlogs() {
//		return this.blogs;
//	}

	public void setBlogs(Set<Blog> blogs) {
		this.blogs = blogs;
	}

}
