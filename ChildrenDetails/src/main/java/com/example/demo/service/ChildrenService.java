package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Children;
import com.example.demo.repository.ChildrenRepository;

@Service
public class ChildrenService {

	@Autowired
	ChildrenRepository repository;
	
	public boolean addChildren(Children children) {
		repository.save(children);
		return true;
	}

	public List<Children> getChildren() {
		return repository.findAll();
	}

	public List<Children> getChildrenSorted(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	public List<Children> getChildrenWithPagination(int offset, int pagesize) {
		Page<Children>page=repository.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}

	public List<Children> getChildrenWithPaginationField(int offset, int pagesize, String field) {
		Page<Children>page=repository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return page.getContent();
	}

}
