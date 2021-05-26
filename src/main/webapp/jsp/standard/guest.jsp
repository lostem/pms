<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ax" tagdir="/WEB-INF/tags" %>


<ax:set key="title" value="${pageName}"/>
<ax:set key="page_desc" value="${PAGE_REMARK}"/>
<ax:set key="page_auto_height" value="true"/>

<ax:layout name="base">
    <jsp:attribute name="script">
        <script type="text/javascript" src="<c:url value='/assets/js/view/standard/guest.js' />">
    </script>
    </jsp:attribute>
    <jsp:body>

        <ax:page-buttons></ax:page-buttons>

        <div role="page-header">
            <ax:form name="searchView0">
                <ax:tbl clazz="ax-search-tbl" minWidth="500px">
                    <ax:tr>
                        <ax:td label='이름' width="400px">
                            <input type="text" name="guestNm" class="js-guestNm form-control" />
                        </ax:td>
                        <ax:td label='전화번호' width="400px">
                            <input type="text" name="guestTel" class="js-guestTel form-control" data-ax5formatter="phone" />
                        </ax:td>
                        <ax:td label='이메일' width="550px">
                            <input type="text" name="email" class="js-email form-control" />
                        </ax:td>   
                    </ax:tr>
                </ax:tbl>
            </ax:form>
            <div class="H10"></div>
        </div>

        <ax:split-layout name="ax1" orientation="vertical">
            <ax:split-panel width="800" style="padding-right: 10px;">
                <!-- 목록 -->
                <div class="ax-button-group" data-fit-height-aside="grid-view-01" >
                    <div class="left">
                        <h2><i class="cqc-list"></i> 투숙객 목록</h2>
                    </div>
                    <div class="right">
                    </div>
                </div>
                <div data-ax5grid="grid-view-01" data-fit-height-content="grid-view-01" style="height: 300px;"></div>
            </ax:split-panel>
            <ax:splitter></ax:splitter>
            <ax:split-panel width="*" style="padding-left: 10px;">
                <div data-fit-height-aside="form-view-01">
                    <div class="ax-button-group">
                        <div class="left">
                            <h2><i class="cqc-news"></i> 투숙객 정보 </h2>
                        </div>
                        <div class="right">
                            <button type="button" class="btn btn-default" data-form-view-01-btn="form-clear">
                                <i class="cqc-erase"></i> <ax:lang id="ax.admin.clear"/>
                            </button>
                        </div>
                    </div>

                    <form name="formView01" class="js-form">
                        <ax:tbl clazz="ax-form-tbl" minWidth="500px">

                            <ax:tr labelWidth="120px">
                                <ax:td label="이름" width="50%">
                                    <input type="text" name="guestNm" data-ax-path="guestNm"  class="form-control" title="이름" data-ax-validate="required" />
                                </ax:td>
                                <ax:td label="영문" width="50%">
                                    <input type="text" name="guestNmEng" data-ax-path="guestNmEng"  class="form-control" />
                                </ax:td>
                            </ax:tr>

                            <ax:tr labelWidth="120px">
                                <ax:td label="연락처" width="50%">
                                    <input type="text" name="gusetTel" data-ax-path="gusetTel"  class="form-control" data-ax5formatter="phone"  />
                                </ax:td>
                                <ax:td label="이메일" width="50%">
                                    <input type="text" name="email" data-ax-path="email" class="form-control"   placeholder="x@x.xxx"  />
                                </ax:td>
                            </ax:tr>
                            <ax:tr labelWidth="120px">
                                <ax:td label="언어" width="50%">
                                    <ax:common-code groupCd="LANG" name="langCd"  dataPath="langCd" clazz="js-roomType" />
                                </ax:td>
                                <ax:td label="생년월일" width="35%">
                                    <div class="input-group" data-ax5picker="brth" >
                                        <input type="text" class="form-control" name="brth" data-ax-path="brth" placeholder="YYYY-MM-DD" />
                                        <span class="input-group-addon"><i class="cqc-calendar"></i></span>
                                    </div>
                                </ax:td> 
                                <span>
                                    <label ><input type="radio" data-ax-path="gender" name="gender" value="남자" >남 </label>
                                    <label ><input type="radio" data-ax-path="gender" name="gender" value="여자" >여 </label>
                                </span>
                            </ax:tr>
                            <ax:tr labelWidth="120px">
                                <ax:td label="비고" width="100%">
                                    <textarea name="remark" data-ax-path="remark" rows="5" class="form-control"></textarea>
                                </ax:td>
                            </ax:tr>

                            <div class="ax-button-group" data-fit-height-aside="grid-view-02" >
                                <div class="left">
                                    <h2><i class="cqc-list"></i> 투숙 이력</h2>
                                </div>
                                <div class="right">
                                </div>
                            </div>
                            <div data-ax5grid="grid-view-02" style="height: 300px;"></div>

                        </ax:tbl>
                    </form>
                </div>

            </ax:split-panel>
        </ax:split-layout>

    </jsp:body>
</ax:layout>

