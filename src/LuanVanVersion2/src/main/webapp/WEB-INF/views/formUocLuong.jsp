<%@ page language="java" pageEncoding="utf8" contentType="text/html;charset=UTF-8"%>
<ul class="nav nav-tabs">
  <li role="presentation" class="active"><a href="#chucNang" data-toggle="tab">I Yêu cầu chức năng</a></li>
  <li role="presentation"><a href="#tabTacNhan" data-toggle="tab">III Tính điểm tác nhân</a></li>
  <li role="presentation"><a href="#tabUsecase" data-toggle="tab">IV Tính điểm Use-Case</a></li>
  <li role="presentation"><a href="#tabKTCN" data-toggle="tab">V Kỹ thuật công nghệ</a></li>
  <li role="presentation"><a href="#tabMoiTruong" data-toggle="tab">VI Môi trường</a></li>
  <li role="presentation"><a href="#tabLuong" data-toggle="tab">Bảng Lương</a></li>
  <li role="presentation"><a href="#tabGiaTriPhanMem" data-toggle="tab">VII Giá trị phần mềm</a></li>
  <li role="presentation"><a href="#tabTongHop" data-toggle="tab">VIII Tổng hợp chi phí</a></li>
</ul>

<div class="tab-content">
        <div class="tab-pane fade in active" id="chucNang">
          	 <%@ include file="/WEB-INF/views/yeucau-chucnang.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabTacNhan">
            <%@ include file="/WEB-INF/views/tinhdiem-tacnhan.jsp" %>
        </div>
         <div class="tab-pane fade" id="tabUsecase">
            <%@ include file="/WEB-INF/views/tinhdiem-usecase.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabKTCN">
            <%@ include file="/WEB-INF/views/kythuat-congnghe.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabMoiTruong">
            <%@ include file="/WEB-INF/views/moitruong.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabLuong">
            <%@ include file="/WEB-INF/views/bangluong.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabGiaTriPhanMem">
            <%@ include file="/WEB-INF/views/giatri-phanmem.jsp" %>
        </div>
        <div class="tab-pane fade" id="tabTongHop">
            <%@ include file="/WEB-INF/views/tonghop-chiphi.jsp" %>
        </div>
</div>
