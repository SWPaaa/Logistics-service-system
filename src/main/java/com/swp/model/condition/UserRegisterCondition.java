package com.swp.model.condition;

import com.swp.Enum.SexEnum;
import com.swp.Enum.UserTypeEnum;
import lombok.Data;
import org.apache.commons.fileupload.FileItem;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename UserLoginCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:28</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserRegisterCondition implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * �û���
     */
    @NotBlank(message = "�û�����Ϊ��")
    private String username;
    /**
     * ����
     */
    @NotBlank(message = "���벻Ϊ��")
    private String password;
    /**
     * ����
     */
    private String name;
    /**
     * ��ʵ����
     */
    @NotBlank(message = "��ʵ������Ϊ��")
    private String realName;
    /**
     * �Ա�
     */
    private SexEnum sex;
    /**
     * �ƶ��绰
     */
    @NotBlank(message = "�ƶ��绰��Ϊ��")
    private String phone;
    /**
     * ��˾����
     */
    @NotBlank(message = "��˾���Ʋ�Ϊ��")
    private String companyName;
    /**
     * ʡ�д���
     */
    @NotBlank(message = "ʡ�д��벻Ϊ��")
    private String areaCode;
    /**
     * ��˾��ַ
     */
    @NotBlank(message = "��˾��ַ��Ϊ��")
    private String companyAddress;
    /**
     * ��˾�绰
     */
    @NotBlank(message = "��˾�绰��Ϊ��")
    private String companyPhone;
    /**
     * ��ҵ����
     */
    private UserTypeEnum type;
    /**
     * ��˾֤��
     */
    private MultipartFile file;
    /**
     * ��˾֤������·��
     */
    private String companyUrl;
    /**
     * ��ע
     */
    private String remark;

}
