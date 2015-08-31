package com.example.user.academicapp.repository.interfaces;

import java.util.List;

public interface ReadableRepository<T> {
	public List<T> fetchAll();
	public List<T> fetchByCriteria(SearchCriteria criteria);
}
