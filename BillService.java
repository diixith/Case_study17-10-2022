package com.gl.Case_Study4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.Case_Study4.bean.Bill;
import com.gl.Case_Study4.repository.BillRepository;

@Service
public class BillService {
	@Autowired
	private BillRepository repos;
	public Long generateId() {
		Long val = repos.findMaxBillId();
		if(val==null)
			val=100001L;
		else
			val=val+1;
		return val;
	}

	public void billSave(Bill bill) 
	{
		repos.save(bill);
	}
}
