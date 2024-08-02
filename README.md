# JAVA/SPRING: SNS 소셜미디어 사이트 구축 (http://35.165.131.136/)

로그인을 통해 사이트에 접속하여 소셜미디어 형태의 게시글을 올리거나 조회할 수 있습니다.<br />
<br />
디자인부터 frontend, backend, 클라우드 인프라까지 모두 직접 개발했습니다.<br />
WAS와 DBMS는 AWS에 배포되어 있으므로 소스는 전체 중 일부만 업로드했습니다. :)<br />
<br />
정식 구매한 도메인으로 실제 운영 중인 본인의 개인사이트를 포트폴리오용으로 미러링하여<br />
데이터는 맛보기용 샘플데이터만 들어있습니다만 글쓰기는 누구나 가능하니 시도해보세요!<br />
[DEMO](http://35.165.131.136/) <b>(비밀번호: 1)</b><br />
<br />

## 화면설명
검색버튼 아래 탭을 선택하여 원하는 기능을 사용할 수 있습니다.<br />
기본 선택은 LIST 탭이고 일반적인 소셜미디어의 기능을 갖추고 있습니다.<br />
WRITE 탭에서 글쓰기할 수 있고 에디터 기능, 이미지업로드 기능, 링크(임베딩) 기능 등이 있습니다.<br />
상세한 기능은 사이트에 직접 접속해서 테스트 해보세요!<br />
<br />

### <PC 샘플화면>
<p align="left">
	<img width="1600" alt="sns01" src="https://github.com/user-attachments/assets/50fcad4a-4665-4c80-aafe-ea0cb28cf716">
</p>

### <모바일 샘플화면: LIST 탭>
기본 타임라인<br />
일반적인 소셜미디어처럼 스크롤을 통해 미리보기가 가능합니다.<br />
포스트를 클릭하여 세부내용을 보거나 수정 가능합니다.<br />
미리보기보다 긴 포스트는 [more] 버튼을 클릭하여 나머지 내용을 모두 확인할 수 있습니다.<br />
![sns02](https://github.com/user-attachments/assets/8e4d7a1c-8a79-4430-928f-0765f2a36264)
<br />
![sns03](https://github.com/user-attachments/assets/91773196-3a2d-42bf-b8b5-fb58a9e59f0c)
<br />

### <모바일 샘플화면: SSO 탭>
스크롤 방식인 LIST 탭과 다르게 페이지 방식으로 이동 가능합니다.<br />
클릭하여 세부내용을 조회합니다.<br />
![sns04](https://github.com/user-attachments/assets/0d952952-940b-439a-a20c-a668f914058a)
<br />
