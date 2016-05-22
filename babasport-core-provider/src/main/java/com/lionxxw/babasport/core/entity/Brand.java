package com.lionxxw.babasport.core.entity;

public class Brand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.img_url
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.sort
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.is_display
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    private Integer isDisplay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.id
     *
     * @return the value of brand.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.id
     *
     * @param id the value for brand.id
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.name
     *
     * @return the value of brand.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.name
     *
     * @param name the value for brand.name
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.description
     *
     * @return the value of brand.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.description
     *
     * @param description the value for brand.description
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.img_url
     *
     * @return the value of brand.img_url
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.img_url
     *
     * @param imgUrl the value for brand.img_url
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.sort
     *
     * @return the value of brand.sort
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.sort
     *
     * @param sort the value for brand.sort
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.is_display
     *
     * @return the value of brand.is_display
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public Integer getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.is_display
     *
     * @param isDisplay the value for brand.is_display
     *
     * @mbggenerated Sat May 21 23:33:34 CST 2016
     */
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }
}