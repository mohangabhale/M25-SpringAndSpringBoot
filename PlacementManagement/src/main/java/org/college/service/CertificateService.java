
package org.college.service;

import java.util.List;

import javax.transaction.Transactional;

import org.college.entity.Certificate;
import org.college.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService {

	@Autowired
	private CertificateRepository cer;

	public List<Certificate> listAll() {
		return cer.findAll();
	}

	public void save(Certificate certificate) {
		cer.save(certificate);
	}

	public Certificate get(Integer id) {
		return cer.findById(id).get();
	}

	public void delete(Integer id) {
		cer.deleteById(id);
	}

}