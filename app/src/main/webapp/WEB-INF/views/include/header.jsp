<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<header>
			<div class="inner">
				<a href="javascript:void(0)"><img id="imgLogo" src="/images/logo_01.png" alt="logo" /></a>
				<span class="spn-search">
					<input type="text" name="keyword" value="${page.keyword}" maxlength="50" placeholder="LIST SEARCH" />
					<span id="spnSearch" class="material-symbols-outlined">search</span>
				</span>
			</div>
			<nav>
				<ul>
					<li>
						<a href="javascript:alert('Coming soon!')">MEME<span id="spnMeme" class="new"></span></a>
					</li>
					<li>
						<a href="/sso/list">SSO<span id="spnSso" class="new"></span></a>
					</li>
					<li>
						<a href="/board/list">LIST<span id="spnBoard" class="new"></span></a>
					</li>
					<li>
						<a href="/board/write">WRITE</a>
					</li>
					<li>
						<a id="aExit" href="javascript:void(0)">GETOUT<span class="material-symbols-outlined">logout</span></a>
					</li>
				</ul>
			</nav>
		</header>