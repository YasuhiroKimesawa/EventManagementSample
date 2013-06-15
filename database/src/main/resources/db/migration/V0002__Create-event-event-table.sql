CREATE TABLE event.event (
	id bigint NOT NULL,    -- イベントid
	"name" character varying(50) NOT NULL,    -- イベント名
	created_at timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP    -- 作成日時
);
COMMENT ON COLUMN event.event.id
    IS 'イベントid';
COMMENT ON COLUMN event.event.name
    IS 'イベント名';
COMMENT ON COLUMN event.event.created_at
    IS '作成日時';

ALTER TABLE event.event ADD CONSTRAINT PK_event
	PRIMARY KEY (id);

ALTER TABLE event.event
  OWNER TO eventmanage;
