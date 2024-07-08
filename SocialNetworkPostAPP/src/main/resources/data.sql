CREATE SEQUENCE social_network_post_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE SocialNetworkPost (
    id NUMBER PRIMARY KEY,
    post_date DATE,
    post_category VARCHAR2(50),
    author VARCHAR2(100),
    content VARCHAR2(1000),
    view_count NUMBER
);

INSERT INTO SocialNetworkPost (id, post_date, post_category, author, content, view_count) VALUES
(social_network_post_seq.NEXTVAL, TO_DATE('2024-01-15', 'YYYY-MM-DD'), 'Music', 'Alice', 'Check out my new song!', 1570),
(social_network_post_seq.NEXTVAL, TO_DATE('2024-02-22', 'YYYY-MM-DD'), 'Gaming', 'Bob', 'Just finished an epic gaming session!', 2215),
-- add more entries here...
