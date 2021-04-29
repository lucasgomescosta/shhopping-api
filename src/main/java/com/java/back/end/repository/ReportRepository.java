package com.java.back.end.repository;

import java.util.Date;
import java.util.List;

import com.java.back.end.dto.ShopReportDTO;
import com.java.back.end.model.Shop;

public interface ReportRepository {

	public List<Shop> getShopByFilters(Date dataInicio, Date dataFim, Float valorMinimo);
	
	public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim);
	
}
