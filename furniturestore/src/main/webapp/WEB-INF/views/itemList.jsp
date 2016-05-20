<head>
<link rel="stylesheet" type="text/css" href="./resources/css/magnify.css">
<script type="text/javascript" src="./resources/js/Event.js"></script>
<script type="text/javascript" src="./resources/js/Magnifier.js"></script>
<script type="text/javascript">
var evt = new Event(),
    m = new Magnifier(evt);
</script>
<style>
m.attach({
    thumb: '#thumb',
    large: <img alt="" src="<c:url value="/resources/images/${item.itemId}.png" /> ">
    largeWrapper: 'preview'
});
</style>
</head>
<div class="span7 popular_products">
				 <h3>Popular products</h3><br>
				<ul class="thumbnails">
				
				
				<c:forEach items="${items}" var="item">
				<c:if test="${searchCondition != null && searchCondition == item.itemCategory}">
				<li class="span2">
				  <div class="thumbnail">
					<a href="<spring:url value="/furnitures/showitem/${item.itemId}" />"> <img alt="" src="<c:url value="/resources/images/${item.itemId}.png" /> ">
					<div class="caption">
					  <h5>${item.itemName}</h5>  Price: ${item.itemPrice}</a><br><br>
					</div>
				  </div>
				</li>
				</c:if>
				<c:if test="${searchCondition == null }">
				<li class="span2">
				  <div class="thumbnail" id="preview">
					<a  class="magnifier-thumb-wrapper" href="<spring:url value="/furnitures/showitem/${item.itemId}" />"> <img id="thumb" alt="" src="<c:url value="/resources/images/${item.itemId}.png" /> ">
					<div class="caption">
					  <h5>${item.itemName}</h5>  Price: Rs. ${item.itemPrice}</a><br><br>
					</div>
				  </div>
				</li>
				</c:if>
               </c:forEach>
				

			  </ul>
		</div>