create or replace view enrollment_count as
    select t.id as termId, t.title, c.id as classId, c.name as className, count(e.id) as enrollmentCount
    from term t
    left outer join class c on c.termId = t.id
    left outer join enrollment en on en.termId = t.id
    left outer join enroll e on (en.id = e.enrollmentId and e.classId = c.id)
    group by t.id, t.title, c.id, c.name;