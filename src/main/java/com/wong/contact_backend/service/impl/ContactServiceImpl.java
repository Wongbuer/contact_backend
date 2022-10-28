package com.wong.contact_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wong.contact_backend.dao.ContactMapper;
import com.wong.contact_backend.entity.Contact;
import com.wong.contact_backend.service.ContactService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl extends ServiceImpl<ContactMapper, Contact> implements ContactService {
}
