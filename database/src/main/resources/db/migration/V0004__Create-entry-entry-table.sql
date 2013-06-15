CREATE TABLE entry.entry (
	entry_id bigint NOT NULL,    -- 参加者ID
	event_id bigint NOT NULL,    -- イベントID
	first_name character varying(20) NOT NULL,    -- 姓
	last_name character varying(20) NOT NULL,    -- 名
	twitter_id character varying(15),    -- ツイッターID
	mail_address character varying(200) NOT NULL,    -- メールアドレス
	created_at timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP -- 作成日時
);
COMMENT ON COLUMN entry.entry.entry_id
    IS '参加者ID';
COMMENT ON COLUMN entry.entry.event_id
    IS 'イベントID';
COMMENT ON COLUMN entry.entry.first_name
    IS '姓';
COMMENT ON COLUMN entry.entry.last_name
    IS '名';
COMMENT ON COLUMN entry.entry.twitter_id
    IS 'ツイッターID';
COMMENT ON COLUMN entry.entry.mail_address
    IS 'メールアドレス';
COMMENT ON COLUMN entry.entry.created_at
    IS '作成日時';

ALTER TABLE entry.entry ADD CONSTRAINT PK_entry
	PRIMARY KEY (entry_id);


ALTER TABLE entry.entry ADD CONSTRAINT FK_entry_event
	FOREIGN KEY (event_id) REFERENCES event.event (id);

ALTER TABLE entry.entry
  OWNER TO eventmanage;