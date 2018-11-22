package com.dimple.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class Links implements Serializable {
    /**
     * id
     */
    private Integer linkId;

    /**
     * 友链的标题
     */
    private String title;

    /**
     * 是否显示(1表示显示，0表示不显示)
     */
    private Boolean display;

    /**
     * 是否已经处理(1表示已经处理，0表示没有处理)
     */
    private Boolean status;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 友链链接地址
     */
    private String url;

    /**
     * 友链的描述
     */
    private String description;

    /**
     * links
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return link_id id
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * id
     * @param linkId id
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * 友链的标题
     * @return title 友链的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 友链的标题
     * @param title 友链的标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 是否显示(1表示显示，0表示不显示)
     * @return display 是否显示(1表示显示，0表示不显示)
     */
    public Boolean getDisplay() {
        return display;
    }

    /**
     * 是否显示(1表示显示，0表示不显示)
     * @param display 是否显示(1表示显示，0表示不显示)
     */
    public void setDisplay(Boolean display) {
        this.display = display;
    }

    /**
     * 是否已经处理(1表示已经处理，0表示没有处理)
     * @return status 是否已经处理(1表示已经处理，0表示没有处理)
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 是否已经处理(1表示已经处理，0表示没有处理)
     * @param status 是否已经处理(1表示已经处理，0表示没有处理)
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 权重
     * @return weight 权重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 权重
     * @param weight 权重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 友链链接地址
     * @return url 友链链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 友链链接地址
     * @param url 友链链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 友链的描述
     * @return description 友链的描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 友链的描述
     * @param description 友链的描述
     */
    public void setDescription(String description) {
        this.description = description;
    }


}