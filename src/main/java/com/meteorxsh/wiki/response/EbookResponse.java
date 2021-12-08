package com.meteorxsh.wiki.response;

public class EbookResponse {

  private Long id;

  private String name;

  private Long catagory1Id;

  private Long catagory2Id;

  private String description;

  private String cover;

  private Integer docCount;

  private Integer viewCount;

  private Integer voteCount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCatagory1Id() {
    return catagory1Id;
  }

  public void setCatagory1Id(Long catagory1Id) {
    this.catagory1Id = catagory1Id;
  }

  public Long getCatagory2Id() {
    return catagory2Id;
  }

  public void setCatagory2Id(Long catagory2Id) {
    this.catagory2Id = catagory2Id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public Integer getDocCount() {
    return docCount;
  }

  public void setDocCount(Integer docCount) {
    this.docCount = docCount;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", id=").append(id);
    sb.append(", name=").append(name);
    sb.append(", catagory1Id=").append(catagory1Id);
    sb.append(", catagory2Id=").append(catagory2Id);
    sb.append(", description=").append(description);
    sb.append(", cover=").append(cover);
    sb.append(", docCount=").append(docCount);
    sb.append(", viewCount=").append(viewCount);
    sb.append(", voteCount=").append(voteCount);
    sb.append("]");
    return sb.toString();
  }
}